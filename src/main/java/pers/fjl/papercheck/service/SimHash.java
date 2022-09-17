package pers.fjl.papercheck.service;
/**
 * @program: PaperCheck
 *
 * @description: ${description}
 *
 * @author: Fang Jiale
 *
 * @create: 2020-10-24 17:05
 **/
import pers.fjl.papercheck.service.impl.SimHashImpl;

import java.math.BigInteger;
import java.util.List;

public interface SimHash {

    BigInteger simHash();

    BigInteger hash(String source);

    int hammingDistance(SimHashImpl other);

    double getDistance(String str1, String str2);

    List subByDistance(SimHashImpl simHashImpl, int distance);
}
