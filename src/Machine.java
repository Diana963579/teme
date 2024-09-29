public interface Machine {
        void print();
        void scan();
        void fax();
    }

    class Printer implements Machine {
        @Override
        public void print() {
            System.out.println("Printing...");
        }

        @Override
        public void scan() {
            // Not needed for Printer
        }

        @Override
        public void fax() {
            // Not needed for Printer
        }
    }