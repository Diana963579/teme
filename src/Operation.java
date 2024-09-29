public enum Operation {
        ADD {
            public double apply(double x, double y) {
                return x + y;
            }
        },
        SUBTRACT {
            public double apply(double x, double y) {
                return x - y;
            }
        },
        MULTIPLY {
            public double apply(double x, double y) {
                return x * y;
            }
        },
        DIVIDE {
            public double apply(double x, double y) {
                return x / y;
            }
        };

        public abstract double apply(double x, double y);
    }