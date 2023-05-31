 abstract public class Product {
     private int code;
        private int price;
        private String name;
        protected Product(int price, String name) {
            this.price = price;
            this.name=name;
        }

        public int getPrice() {
            return price;
        }
        public String getName(){
            return name;
        }
        @Override
        public String toString(){
            return "Name : "+name+
                    ", Price : "+price;
        }
    }

