package org.miolacnc.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.miolacnc.models.Miolacnc;
import org.miolacnc.repository.MiolacncRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "miolacnc")
public class MiolacncService {
    @Autowired
    private MiolacncRepo repo;

    public List<Miolacnc> getEvsM() {
        return repo.findAll();
    }

    public Miolacnc getEvMById(int id) {
        return repo.findById(id).orElse(null);
    }


}