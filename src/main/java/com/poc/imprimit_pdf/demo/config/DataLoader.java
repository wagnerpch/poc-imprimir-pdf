package com.poc.imprimit_pdf.demo.config;

import com.poc.imprimit_pdf.demo.model.User;
import com.poc.imprimit_pdf.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(UserRepository usuarioRepository) {
        return args -> {
            usuarioRepository.save(new User(null, "Shamxua Gioimph","shamxua.gioimph@email.com.br"));
            usuarioRepository.save(new User(null, "Nefey Yurtio","nefey.yurtio@email.com.br"));
            usuarioRepository.save(new User(null, "Farut Sian","farut.sian@email.com.br"));
            usuarioRepository.save(new User(null, "Dalam Bigorei","dalam.bigorei@email.com.br"));
            usuarioRepository.save(new User(null, "Faenoe Valde","faenoe.valde@email.com.br"));
            usuarioRepository.save(new User(null, "Linbloho Dyutuoerl","linbloho.dyutuoerl@email.com.br"));
            usuarioRepository.save(new User(null, "Maurt Biufu","maurt.biufu@email.com.br"));
            usuarioRepository.save(new User(null, "Durtuyring Wiusdek","durtuyring.wiusdek@email.com.br"));
            usuarioRepository.save(new User(null, "Inpen Durazey","inpen.durazey@email.com.br"));
            usuarioRepository.save(new User(null, "Lurol Aninbin","lurol.aninbin@email.com.br"));
            usuarioRepository.save(new User(null, "Roseoak Aranza","roseoak.aranza@email.com.br"));
            usuarioRepository.save(new User(null, "Iscuaclo Gurhu","iscuaclo.gurhu@email.com.br"));
            usuarioRepository.save(new User(null, "Zeflofe Gimpudak","zeflofe.gimpudak@email.com.br"));
            usuarioRepository.save(new User(null, "Geype Siwuwin","geype.siwuwin@email.com.br"));
            usuarioRepository.save(new User(null, "Rivao Brasuyramph","rivao.brasuyramph@email.com.br"));
            usuarioRepository.save(new User(null, "Ahkio Hyoku","ahkio.hyoku@email.com.br"));
            usuarioRepository.save(new User(null, "Faley Wazeyinit","faley.wazeyinit@email.com.br"));
            usuarioRepository.save(new User(null, "Plobu Rubudor","plobu.rubudor@email.com.br"));
            usuarioRepository.save(new User(null, "Kahmipea Umurli","kahmipea.umurli@email.com.br"));
            usuarioRepository.save(new User(null, "Asrur Duslioek","asrur.duslioek@email.com.br"));
            usuarioRepository.save(new User(null, "Lathir Cleka","lathir.cleka@email.com.br"));
            usuarioRepository.save(new User(null, "Ryuhiaron Duermyedal","ryuhiaron.duermyedal@email.com.br"));
            usuarioRepository.save(new User(null, "Dupiral Rogdgoipa","dupiral.rogdgoipa@email.com.br"));
            usuarioRepository.save(new User(null, "Galreor Rewar","galreor.rewar@email.com.br"));
            usuarioRepository.save(new User(null, "Orpa Riebug","orpa.riebug@email.com.br"));
            usuarioRepository.save(new User(null, "Tyuarrond Ulcina","tyuarrond.ulcina@email.com.br"));
            usuarioRepository.save(new User(null, "Poris Aranron","poris.aranron@email.com.br"));
            usuarioRepository.save(new User(null, "Mocuyla Brugvogub","mocuyla.brugvogub@email.com.br"));
            usuarioRepository.save(new User(null, "Gilcesai Taris","gilcesai.taris@email.com.br"));
            usuarioRepository.save(new User(null, "Poryu Sadua","poryu.sadua@email.com.br"));
        };
    }
}

