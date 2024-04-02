interface PaintOptions {
  shape: Shape;
  xPos?: number;
  yPos?: number;
}

function paintShape(opts: PaintOptions) {
  console.log(opts.shape);
}

function paintShape2({ shape }: PaintOptions) {
  console.log(shape);
}

function paintShape3({ shape }: { shape: Shape }) {
  console.log(shape);
}
