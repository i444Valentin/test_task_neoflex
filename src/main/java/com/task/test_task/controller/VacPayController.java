package com.task.test_task.controller;
import com.task.test_task.model.Request.DaysAvgPay;
import com.task.test_task.model.Response.VacSums;
import com.task.test_task.service.CalcVacPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class VacPayController {

    private final CalcVacPay calcVacPay;

    @Autowired
    public VacPayController(CalcVacPay calcVacPay){
        this.calcVacPay = calcVacPay;
    }
    @GetMapping
    public VacSums getVacSums(DaysAvgPay daysAvgPay){
        return calcVacPay.getVacSums(daysAvgPay);
    }
}
