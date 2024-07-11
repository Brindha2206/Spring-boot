package mec.poc.mec_intern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CourierService {
    @Autowired
    CourierRemote remote;

public List<Courier> implementFindAll(){
    return remote.findAll();
}
public Courier implementSave(Courier courier){
    return remote.save(courier);
}
public void implementDelete(int id){
    remote.deleteById(id);
}
}
