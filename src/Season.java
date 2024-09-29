public enum Season {
        WINTER(-5), SPRING(15), SUMMER(30), FALL(10);

        private final int avgTemperature;

        Season(int avgTemperature) {
            this.avgTemperature = avgTemperature;
        }

        public int getAvgTemperature() {
            return avgTemperature;
        }
    }