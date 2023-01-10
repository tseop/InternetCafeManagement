package com.seop.cafe.view;

import com.seop.cafe.view.common.EndView;
import com.seop.cafe.view.product.ProductAddView;
import com.seop.cafe.view.product.ProductSearchCategoryView;
import com.seop.cafe.view.product.delete.ProductDeleteView;
import com.seop.cafe.view.product.find.ProductFindNameView;
import com.seop.cafe.view.product.ProductSearchView;
import com.seop.cafe.view.product.ProductUpdateView;
import com.seop.cafe.view.member.MemberSelectForm;
import com.seop.cafe.view.member.delete.MemberDeleteView;
import com.seop.cafe.view.member.find.MemberNameSearchView;
import com.seop.cafe.view.member.regist.MemberRegisterFormView;
import com.seop.cafe.view.member.regist.MemberRegisterView;
import com.seop.cafe.view.member.find.MemberSearchView;
import com.seop.cafe.view.member.update.MemberUpdateCompView;
import com.seop.cafe.view.member.delete.MemberDeleteFormView;
import com.seop.cafe.view.member.find.MemberNameSearchFormView;
import com.seop.cafe.view.member.update.MemberUpdateFindFormView;
import com.seop.cafe.view.member.update.MemberUpdateFindCompFormView;
import com.seop.cafe.view.member.update.MemberUpdateForm;
import com.seop.cafe.view.product.delete.ProductDeleteFormView;
import com.seop.cafe.view.product.find.ProductFindNameFormView;
import java.util.HashMap;
import java.util.Map;

public class ViewFactory {
    private final Map<String, Viewable> views = new HashMap<>();
    private static final ViewFactory instance = new ViewFactory();

    public static ViewFactory getInstance() {
        return instance;
    }

    private ViewFactory() {
        initMember();
        initMemberForm();
        initItem();
        initProductForm();
        views.put("END", new EndView());
    }

    private void initMember() {
        views.put("MEMBER_SELECT_FORM", new MemberSelectForm());
        views.put("MEMBER_REGI_FORM", new MemberRegisterFormView());
        views.put("MEMBER_REGI_COMP", new MemberRegisterView());
        views.put("MEMBER_FIND_ALL_VIEW", new MemberSearchView());
        views.put("MEMBER_SEARCH_NAME_VIEW", new MemberNameSearchView());
        views.put("MEMBER_DELETE_VIEW", new MemberDeleteView());

    }

    private void initMemberForm() {
        views.put("MEMBER_DELETE_SELECT_FORM", new MemberDeleteFormView());
        views.put("MEMBER_SEARCH_NAME_FORM", new MemberNameSearchFormView());
        views.put("MEMBER_UPDATE_FIND_FORM", new MemberUpdateFindFormView());
        views.put("MEMBER_UPDATE_FIND_COMP_FORM", new MemberUpdateFindCompFormView());
        views.put("MEMBER_UPDATE_FORM", new MemberUpdateForm());
        views.put("MEMBER_UPDATE_COMP_FORM", new MemberUpdateCompView());
    }

    private void initItem() {
        views.put("itemAdd", new ProductAddView());
        views.put("PRODUCT_DELETE_VIEW", new ProductDeleteView());
        views.put("PRODUCT_FIND_NAME_VIEW", new ProductFindNameView());
        views.put("itemSearchItems", new ProductSearchView());
        views.put("itemUpdate", new ProductUpdateView());
        views.put("itemCategorySearch", new ProductSearchCategoryView());
    }

    private void initProductForm() {
        views.put("PRODUCT_FIND_DELETE_FORM", new ProductDeleteFormView());
        views.put("PRODUCT_FIND_NAME_FORM", new ProductFindNameFormView());
    }

    public Viewable get(String viewPath) {
        return views.get(viewPath);
    }
}
