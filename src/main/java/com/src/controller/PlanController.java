package com.src.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.src.mapper.FunctionMapper;
import com.src.mapper.PlanMapper;
import com.src.model.Function;
import com.src.model.Plan;
import com.src.response.R;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.management.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class PlanController {

    @Resource
    private FunctionMapper functionMapper;
    @Resource
    private PlanMapper planMapper;

    @GetMapping("/getPlan")
    public R getPlan() {
        List<Function> function = functionMapper.selectList(Wrappers.emptyWrapper());
        List<Plan> plan = planMapper.selectList(Wrappers.emptyWrapper());
        Map m = new HashMap(2);
        m.put("function", function);
        m.put("plan", plan);
        return R.data(m);
    }
}
