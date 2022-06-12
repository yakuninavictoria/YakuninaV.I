public class Supermarket {
    private String nameot, productC, namepr, country, retailPr, namesourse;
    public Supermarket(String nameotdela, String productCode, String name, String cuntry, String retailPrice){
        this.nameot=nameotdela;
        this.productC=productCode;
        this.namepr=name;
        this.country=cuntry;
        this.retailPr=retailPrice;
    }
    public String getNameot() {return nameot;}
    public String getProductC() { return productC;}
    public String getNamepr() {return namepr;}
    public String getCountry() {return country;}
    public String getRetailPr() {return retailPr;}

    public void setNameot(String nameotdela){this.nameot=nameotdela;}
    public void setProductC(String productCode){this.productC=productCode;}
    public void setNamepr(String name){this.namepr=name;}
    public void setCountry(String cuntry){this.country=cuntry;}
    public void setRetailPr(String retailPrice){this.retailPr=retailPrice;}

    public String toString(){
        return "Название отдела: "+nameot+"\n"+
                "Код товара: "+productC+"\n"+
                "Наименование товара: "+namepr+"\n"+
                "Страна-производитель: "+country+"\n"+
                "Розничная цена: "+retailPr+" рублей"+"\n"+
                "Поставщик: "+namesourse+"\n";
    }
    public void setNamesourse(String totalnamesourse){this.namesourse=totalnamesourse;}
    public String getNamesourse (String totalnamesourses){return namesourse;}
}
