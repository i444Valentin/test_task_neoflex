package com.task.test_task;

import com.task.test_task.model.Request.DaysAvgPay;
import com.task.test_task.model.Response.VacSums;
import com.task.test_task.service.CalcVacPay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestTaskApplicationTests {

    @Autowired
    CalcVacPay calcVacPay;

    @Test
    public void checkVacationSumsIsCorrect() {
        DaysAvgPay daysAvgPay = new DaysAvgPay();
        daysAvgPay.setAveragePay(40000d);
        daysAvgPay.setDaysCount(14);
        VacSums vacSums = calcVacPay.getVacSums(daysAvgPay);
        Assertions.assertEquals(vacSums.getVacPay(),19112.63);
    }

}
