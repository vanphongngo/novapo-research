package org.beint.beintappapi.web.rest.v1;

import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.beint.beintappapi.dto.CreateProductDto;
import org.beint.beintappapi.dto.ProductDto;
import org.beint.beintappapi.dto.UpdateProductDto;
import org.beint.beintappapi.dto.response.DataResponse;
import org.beint.beintappapi.dto.response.PageData;
import org.beint.beintappapi.exceptions.ValidationException;
import org.beint.beintappapi.service.product.ProductCreationService;
import org.beint.beintappapi.service.product.ProductDeletionService;
import org.beint.beintappapi.service.product.ProductRetrievalService;
import org.beint.beintappapi.service.product.ProductUpdationService;
import org.beint.beintappapi.utils.ErrorParser;
import org.beint.beintappapi.utils.RegexUtils;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ErrorParser errorParser;

    private final ProductRetrievalService productRetrievalService;
    private final ProductCreationService productCreationService;
    private final ProductUpdationService productUpdationService;
    private  final ProductDeletionService productDeletionService;

    private final List<Integer> threads = new ArrayList<>();

    @PostConstruct
    public void prepare() {
        int numberOfElements = 10000;
        Integer valueToFill = 0;

        for (int i = 0; i < numberOfElements; i++) {
            threads.add(valueToFill);
        }
    }

    @GetMapping()
    public ResponseEntity<PageData<ProductDto>> get(Pageable pageable) throws InterruptedException {
        return new ResponseEntity<>(productRetrievalService.getProducts(pageable), HttpStatus.OK);
    }


    @PostMapping()
    public ResponseEntity<DataResponse<ProductDto>> create(@Valid @RequestBody CreateProductDto createProductDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            throw new ValidationException(errorParser.parse(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage()));
        };

        return new ResponseEntity<>(new DataResponse<>(productCreationService.createProduct(createProductDto)), HttpStatus.OK);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<DataResponse<ProductDto>> create(@PathVariable Long productId, @Valid @RequestBody UpdateProductDto updateProductDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            throw new ValidationException(errorParser.get(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage()));
        };
        return new ResponseEntity<>(new DataResponse<>(productUpdationService.updateProduct(productId, updateProductDto)), HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<DataResponse<ProductDto>> get(@PathVariable Long productId) {
        return new ResponseEntity<>(new DataResponse<>(productRetrievalService.getProduct(productId)), HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<String> delete(@PathVariable Long productId) {
        productDeletionService.delete(productId);
        return new ResponseEntity<>("Successfully",HttpStatus.OK);
    }


}
