package mec.poc.mec_intern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ekart")

public class CourierMapping {
    @Autowired

    public CourierService service;

    @GetMapping("/get")
    public List<Courier> viewAll() {
        return service.implementFindAll();
    }

        @PostMapping("/add")
                public Courier order(@RequestBody Courier courier){
            return service.implementSave(courier);
        }

        @PutMapping("/update")
    public Courier update(@RequestBody Courier courier){
        return service.implementSave(courier) ;
        }
        @DeleteMapping("/delete/{id}")
    public String remove(@PathVariable("id") int id){
         service.implementDelete(id);
         return id+ " has been deleted";
        }

    }



//    private List<Courier> EKart = new ArrayList<>();
//
//@PostConstruct
//public void Service(){
//    EKart.add(new Courier(1,"Brindha","Dress","Tgoode Namakkal",7232,1000f,"Tansit","Myntra"));
//    EKart.add(new Courier(2,"Anusha","Perfume","Salem",7654,500f,"Transit","Amazon"));
//    EKart.add(new Courier(3,"Anisha","Mobile","Salem",9525,15000f,"Delivered","Flipkart"));
//    EKart.add(new Courier(4,"Aarthi","Dress","Erode",7629,800f,"Transit","Meesho"));
//}
//@GetMapping("/view")
//    public List<Courier> viewall(){
//    return EKart;
//}
////adding new item to deliver
//@PostMapping("/add")
//    public Courier addCourier (@RequestBody Courier adds){
//    EKart.add(adds);
//    return adds;
//    }
//
//// update itemStatus
//@PutMapping("/status/{id}")
//    public String StatusUpdate(@PathVariable("id") int id,@RequestBody String newStatus)
//{
//    for(Courier courier : EKart){
//        if (courier.getparcelId() == id){
//            courier.setitemStatus(newStatus);
//            return "The Status has been updated";
//        }
//    }
//    return id + "not found";
//}
//
//}
//view items of particular executive
//
//@GetMapping("/view/{executive}")
//public List<Courier> Executives(@PathVariable("executive")String executive){
//    List<Courier> New = new ArrayList<>();
//    for (Courier courier : EKart){
//        if (courier.getExecutiveName().equalsIgnoreCase(executive)){
//            New.add(courier);
//        }
//    }
//    return New;
//}


