
public class Data {
    public String allData;
    public String surname;
    public String name;
    public String patronymic;
    public String dateOfBirth;
    public String phoneNumber;
    public String sex;
    public int count = 6;

    public Data(String s) {
        this.allData = s;

    }

    public int checkQuantity() {
        int errorCode = 0;
        int q = this.allData.split(" ").length;
        if (q < this.count) {
            errorCode = 1;
        }
        if (q > this.count) {
            errorCode = 2;
        }
        return errorCode;
    }

    public boolean codesErr(int err) {
        if (err == 1) {
            System.out.println("Ошибка 1 - Введено мало данных");
            return true;
        }
        if (err == 2) {
            System.out.println(" Ошибка 2 - Введено много данных");
            return true;
        }
        return false;
    }

    public void checkName(String str, String d) throws RuntimeException{
        if (str.matches("^[a-zA-Z]*$")){
        }
        else {
            throw new DataFormatException(d);
        }
    }
    public void checkDOF(String str, String d) throws RuntimeException {
        if (str.matches("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d")){
        }
        else {
            throw new DataFormatException(d);
        }
    }
    public void checkPhone(String str, String d) throws RuntimeException {
        if (str.matches("[0-9]{11}")){
        }
        else {
            throw new DataFormatException(d);
        }
    }
    public void checkSex(String str,String d) throws RuntimeException {
        if (str.matches("[fm]")){
        }
        else {
            throw new DataFormatException(d);
        }
    }

    public void setSurname() throws RuntimeException{
        String str = this.allData.split(" ")[0];
        checkName(str, "фамилии");
        this.surname = str;
    }
    public void setName() throws  RuntimeException{
        String str = this.allData.split(" ")[1];
        checkName(str, "имени");
        this.name = str;
    }
    public void setPatronymic() throws RuntimeException{
        String str = this.allData.split(" ")[2];
        checkName(str,"отчества");
        this.patronymic = str;
    }
    public void setDateOfBirth() throws RuntimeException{
        String str = this.allData.split(" ")[3];
        checkDOF(str,"даты рождения");
        this.dateOfBirth = str;
    }
    public void setPhoneNumber() throws  RuntimeException{
        String str = this.allData.split(" ")[4];
        checkPhone(str, "номера телефона");
        this.phoneNumber = str;
    }
    public void setSex() throws  RuntimeException{
        String str = this.allData.split(" ")[5];
        checkSex(str, "пола");
        this.sex = str;
    }


}

