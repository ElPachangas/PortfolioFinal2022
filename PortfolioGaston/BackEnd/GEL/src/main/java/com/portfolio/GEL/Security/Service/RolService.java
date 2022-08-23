package com.portfolio.GEL.Security.Service;

import com.portfolio.GEL.Security.Entity.Rol;
import com.portfolio.GEL.Security.Enums.RolNombre;
import com.portfolio.GEL.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional //Para la Persistencia
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
        }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}