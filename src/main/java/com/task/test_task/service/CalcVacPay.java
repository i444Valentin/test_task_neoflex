package com.task.test_task.service;

import com.task.test_task.model.Request.DaysAvgPay;
import com.task.test_task.model.Response.VacSums;
import com.task.test_task.utils.MathUtils;
import org.springframework.stereotype.Service;

@Service
public class CalcVacPay {

    public VacSums getVacSums(DaysAvgPay daysAvgPay){
        Double averageDayPay = daysAvgPay.getAveragePay() / 29.3;
        double vacSums = averageDayPay * daysAvgPay.getDaysCount();
        VacSums vSums = new VacSums();
        vacSums = MathUtils.round(vacSums,2);
        vSums.setVacPay(vacSums);
        return vSums;
    }
}
