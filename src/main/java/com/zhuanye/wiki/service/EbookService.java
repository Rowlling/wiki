package com.zhuanye.wiki.service;

import com.zhuanye.wiki.domain.Ebook;
import com.zhuanye.wiki.domain.EbookExample;
import com.zhuanye.wiki.mapper.EbookMapper;
import com.zhuanye.wiki.req.EbookReq;
import com.zhuanye.wiki.resp.EbookResp;
import com.zhuanye.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource//jdk自带的
    //@Autowired//Spring自带的
    private EbookMapper ebookMapper;
    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        /*List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            *//*EbookResp ebookResp = new EbookResp();
            //ebookResp.setId(ebook.getId());
            BeanUtils.copyProperties(ebook,ebookResp);*//*

            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
            respList.add(ebookResp);
        }*/
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        //return respList;
        return list;
    }
}
