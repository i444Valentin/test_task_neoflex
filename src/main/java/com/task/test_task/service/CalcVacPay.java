package com.task.test_task.service;

import com.task.test_task.model.Request.DaysAvgPay;
import com.task.test_task.model.Response.VacSums;
import org.springframework.stereotype.Service;

@Service
public class CalcVacPay {

    public VacSums getVacSums(DaysAvgPay daysAvgPay){
        Double averageDayPay = daysAvgPay.getAveragePay() / 29.3;
        Double vacSums = averageDayPay * daysAvgPay.getDaysCount();

        VacSums vSums = new VacSums();
        vSums.setVacPay(vacSums);
        return vSums;
    }
}
