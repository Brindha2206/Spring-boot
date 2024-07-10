package mec.poc.mec_intern;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
//back end router:accept the request and process
@RestController


public class BaicRest{
 private int [] balance={
         10000,15000,4000,8000,6000,40000,18000,2000,7500,26000,
         50000,65000,1800,800,6500,4500,17000,2500,7700,200
 };

 @GetMapping("/view")
 public int [] BalAmount(){
  return balance;
 }
 @PutMapping("/charges")
 public int[] Charge(){

  for (int i = 0; i<balance.length;i++){
   if (balance[i]>=5000&& balance[i]<10000){
    balance[i] -= balance[i] * 3/100;
   } else if (balance[i]>=100&& balance[i]<5000) {
    balance[i] -= balance[i] * 5/100;
   }
  }
  return balance;
 }
}
//class Bank{
// public static void main(String[] args) {
//  SpringApplication.run(Bank.class,args);
// }
//}

//public class BaicRest
////{
//// private String[] industry ={
////         "Bank","Health","Education","govt"
//// }  ;
////
// @GetMapping("/all")
// public String[] getIndustries(){
//     return industry;
// }
// @GetMapping("/particular/{index}")
// public String getOneIndustry(@PathVariable int index){
//  return industry[index];
// }
// @GetMapping("/particular/{index}")
// public String getIndustry(@PathVariable("index") int index){
//  return industry[index];
// }
//
// @DeleteMapping("/remove/{index}")
// public String invalidate(@PathVariable("index") int index){
//  String response = industry[index]+" has deleted";
//  industry[index]=null;
//  return response;
// }
//}



