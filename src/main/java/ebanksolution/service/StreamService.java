//package ebanksolution.service;
//
//import ebanksolution.dao.CompteDao;
//import ebanksolution.dao.TransactionDao;
//import ebanksolution.model.Compte;
//import org.aspectj.apache.bcel.classfile.Code;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Stream;
//@Service
//public class StreamService {
//    @Autowired
//    private Compte compte;
//
//    @Autowired
//    private CompteServiceImpl compteServiceImpl;
//
//    @Autowired
//    private CompteDao compteDao;
//
//    @Autowired
//    private TransactionServiceImpl transactionServiceImpl;
//
//    @Autowired
//    private TransactionDao transactionDao;
//
//    public double SommeCompte(int idCompte, float soldeInitial) {
//
//        double somme = compteServiceImpl.getComptes().stream()
//                .mapToDouble(Compte::getSoldeInitial)
//                .sum();
//        return  somme;
//
//    }
//
//}

