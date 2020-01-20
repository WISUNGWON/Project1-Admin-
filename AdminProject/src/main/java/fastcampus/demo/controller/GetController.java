package fastcampus.demo.controller;

import fastcampus.demo.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api") //Localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest(){

        return "Hi getMethod";
    }
    //요청을 받기 위해 메소드를 하나 생성하고 주소를 매칭

    //annotation을 통한 주소 매칭
    @GetMapping("/getParameter") //RequestMapping과는 다르게, 메소드를 지정하지 않고 주소만 설정하면 된다.
    // Localhost:8080/api/getParameter의 주소에 매칭이 됨.
    // 1)Localhost:8080/api/getParameter?id=1234&password=abcd라는 값을 주소창으로 요청
    public String getParameter(@RequestParam String id, @RequestParam/*지역내변수관련 */String password){
        //2) 1)의 값을 받아주기 위해 RequestParam을 사용. id와 password를 매칭해서 해당 값을 받아옴.
        //*지역내 변수에서 미리 패스워드 사용(개발에서 추천하는 것은 변수사용보다는 요청해서 비밀번호 사용을 장려
        System.out.println("id : "+id);
        System.out.println("id : "+password); //3) 들어오는 값을 확인하기 위해 값 출력


        return id+password;

    }

    /*검색을 할 때 여러가지 파라미터를 받을 수 있다. ex) 계정, 이메일, 키워드 등
    ex)Localhost:8080/api/getmultiParameter?account=abcd&email=study@gmail.com&page=10
    여러가지 파라미터를 받기 위해 기존의 방식에서는 계속해서 받을 파라미터를 설정해야 했다. ex) @RequestParam String account ...
    이 문제를 해결하기 위해 객체로 받을 수 있다. model패키지 -> SeachParam 참조
    */
    @GetMapping("/getMultiParameter")
    public String getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return "OK";
    }
}
