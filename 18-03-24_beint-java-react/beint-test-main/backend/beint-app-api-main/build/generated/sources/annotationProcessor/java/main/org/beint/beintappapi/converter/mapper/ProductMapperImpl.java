package org.beint.beintappapi.converter.mapper;

import javax.annotation.processing.Generated;
import org.beint.beintappapi.domain.Product;
import org.beint.beintappapi.dto.ProductDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-05T08:57:03+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setId( product.getId() );
        productDto.setCode( product.getCode() );
        productDto.setName( product.getName() );
        productDto.setBrand( product.getBrand() );
        productDto.setType( product.getType() );
        productDto.setDescription( product.getDescription() );
        productDto.setCategory( product.getCategory() );
        productDto.setCreatedAt( product.getCreatedAt() );
        productDto.setUpdatedAt( product.getUpdatedAt() );

        return productDto;
    }
}
