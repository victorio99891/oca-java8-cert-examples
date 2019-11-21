package main;

enum ComboEnum {

    PICO("small", 1){
        public String getText(){
            return "overriden from PICO";
        }
    },
    MEDIA("medium", 2),
    GRANDE("large", 3){
        public String getSizeCode(){
            return "G";
        }
    };

    private String sizeName;
    private int sizeValue;

    private ComboEnum(String sizeName, int sizeValue){
        this.sizeName = sizeName;
        this.sizeValue = sizeValue;
    }

    public String getSizeCode(){
        return "P/M";
    }

    public String getText(){
        return "RANDOM until override...";
    }

    @Override
    public String toString(){
        return String.format("Size details of %s: \nword=%s\nnumber=%s",
        this.name(),
        this.sizeName, 
        this.sizeValue);
    }

}