package mec.poc.mec_intern;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private long receiverContact;
    private int itemPrice;
    private String itemStatus;
    private String executiveName;

//    public Courier(String itemStatus){
//        this.itemStatus = itemStatus;
//    }
//    public int getparcelId(){
//        return parcelId;
//    }
//    public String getexecutiveName(){
//        return executiveName;
//    }
//    public void setitemStatus(String ItemStatus){
//        this.itemStatus = ItemStatus;
//    }
}


