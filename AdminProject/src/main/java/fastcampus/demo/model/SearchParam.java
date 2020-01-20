package fastcampus.demo.model;

//객체를 통해여 파라미터 받아옴
public class SearchParam {

    private String account;
    private String email;
    private int page;

    //해당 파라미터를 받기위해 get, set메소드와 생성자 필요
    //code -> generator -> getter & setter

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
