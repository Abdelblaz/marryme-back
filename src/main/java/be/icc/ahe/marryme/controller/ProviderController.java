package be.icc.ahe.marryme.controller;

import be.icc.ahe.marryme.dataaccess.dao.ServiceDAO;
import be.icc.ahe.marryme.dataaccess.entity.ServiceEntity;
import be.icc.ahe.marryme.dataaccess.repository.ServicesRepo;
import be.icc.ahe.marryme.exception.sqlexception.ServiceDatabaseException;
import be.icc.ahe.marryme.model.User;
import be.icc.ahe.marryme.model.dto.AllServicesDTO;
import be.icc.ahe.marryme.model.dto.SingleServiceViewDTO;
import be.icc.ahe.marryme.model.mapper.dtomapper.CycleAvoidingMappingContext;
import be.icc.ahe.marryme.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/provider")
public class ProviderController {

    private final ServicesService servicesService ;
    private final ServiceDAO serviceDAO ;



    @Autowired
    public ProviderController(ServicesService servicesService,ServiceDAO serviceDAO ) {
        this.servicesService = servicesService;
        this.serviceDAO = serviceDAO;

    }

    @GetMapping("/allServices")
    public ResponseEntity<AllServicesDTO> getAllProvider(){
        List<AllServicesDTO> list = serviceDAO.findAllServiceForListMenu();

//        List<ServiceEntity> services = (List<ServiceEntity>) servicesService.findAll();
//        for (ServiceEntity s: services) {
//            s.setAddress(null);
//            s.setFermetures(null);
//            s.setFormuleEntities(null);
//            s.setReservationEntities(null);
//
//        }
        return new ResponseEntity( list, HttpStatus.OK);
    }

    @GetMapping("/getService/{serviceId}") // TODO: patch mapping
    public ResponseEntity getService(@PathVariable Long serviceId) throws ServiceDatabaseException {
        ServiceEntity serviceEntity = servicesService.findByID(serviceId);
        SingleServiceViewDTO ssvdto = servicesService.mapServiceToSingleViewDTO(serviceEntity);
        return new ResponseEntity<>(ssvdto, HttpStatus.OK);
    }


}
