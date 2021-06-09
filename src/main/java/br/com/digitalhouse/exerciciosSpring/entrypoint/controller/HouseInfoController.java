package br.com.digitalhouse.exerciciosSpring.entrypoint.controller;

import br.com.digitalhouse.exerciciosSpring.domain.entitys.House;
import br.com.digitalhouse.exerciciosSpring.usecase.model.HouseInfoUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/houseinfo")
@RestController
public class HouseInfoController {
    private final HouseInfoUseCase houseInfoUseCase;

    public HouseInfoController(HouseInfoUseCase houseInfoUseCase) { this.houseInfoUseCase = houseInfoUseCase; }

    @PostMapping  (value = "/postbody",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> postHouseInfo (@RequestBody House house) {
//        HouseInfo houseInfo = this.houseInfoUseCase.postHouseInfo(house);
//        return ResponseEntity
//                .created(URI.create("ok")).body(houseInfo);
        try {
            return new ResponseEntity<Object>(this.houseInfoUseCase.postHouseInfo(house), HttpStatus.OK);
        } catch (RuntimeException ex) {
            return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
//        HouseInfo houseInfo = houseInfoUseCase.postHouseInfo(house);
//        ResponseEntity<HouseInfo> houseInfoResponseEntity = new ResponseEntity<HouseInfo>(houseInfo, HttpStatus.ACCEPTED);
//        return houseInfoUseCase.postHouseInfo(house);
    }
}
