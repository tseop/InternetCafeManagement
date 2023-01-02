package com.seop.cafe.view.detail.member;

import com.seop.cafe.domain.Member;
import com.seop.cafe.view.Viewable;
import java.util.Map;

public class MemberOneSearchView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        System.out.println("MemberOneSearchView - render");
        Member member = (Member) model.get("member");
        System.out.println(member);
    }
}
