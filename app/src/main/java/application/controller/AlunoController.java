package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import application.model.Aluno;
import application.model.AlunoRepository;
import java.util.Optional;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepo;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("alunos", alunoRepo.findAll());
        return "aluno/list";
    }

    @RequestMapping("/insert")
    public String insertForm() {
        return "aluno/insert"; 
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insertPost(
        @RequestParam("nome") String nome,
        @RequestParam("idade") int idade
    ){
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setIdade(idade);
        
        alunoRepo.save(aluno);

        return "redirect:/aluno/list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(
        @RequestParam("id") int id,
        Model model
    ) {
        Optional<Aluno> resultado = alunoRepo.findById(id);

        if(resultado.isPresent()) {
            model.addAttribute("aluno", resultado.get());
            return "aluno/update";
        }

        return "aluno/update";
    }
}
