public class DataFormatException extends RuntimeException {
    private String data;
    public String getData(){
        return data;
    }
    public DataFormatException(String data){
        super("Ошибка, неверный формат " + data + "!");
        this.data = data;
    }


}
