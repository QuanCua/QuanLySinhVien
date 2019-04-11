/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class DuLieuHocSinh {

    //Khai báo 1 đối tượng thuộc lớp DuLieuHocSinh
    private static DuLieuHocSinh service = new DuLieuHocSinh();

    public static DuLieuHocSinh getIntance() {
        return service;
    }

    private List<HocSinh> lstHocSinh = new ArrayList();

    public void TaoDuLieuHS() {
        HocSinh obj1 = new HocSinh("Nguyễn Văn A", "Thợ xây", "ABC", "0123456789");
        lstHocSinh.add(obj1);

        HocSinh obj2 = new HocSinh("Nguyễn Văn B", "Thợ xây", "ABC", "0123456788");
        lstHocSinh.add(obj2);

        HocSinh obj3 = new HocSinh("Nguyễn Văn C", "Thợ xây", "ABC", "0123456787");
        lstHocSinh.add(obj3);

        HocSinh obj4 = new HocSinh("Nguyễn Văn D", "Thợ xây", "ABC", "0123456786");
        lstHocSinh.add(obj4);

        HocSinh obj5 = new HocSinh("Nguyễn Văn E", "Thợ xây", "ABC", "0123456785");
        lstHocSinh.add(obj5);

        HocSinh obj6 = new HocSinh("Nguyễn Văn F", "Thợ xây", "ABC", "0123456784");
        lstHocSinh.add(obj6);

        HocSinh obj7 = new HocSinh("Nguyễn Văn G", "Thợ xây", "ABC", "0123456783");
        lstHocSinh.add(obj7);

        HocSinh obj8 = new HocSinh("Nguyễn Văn H", "Thợ xây", "ABC", "0123456782");
        lstHocSinh.add(obj8);

        HocSinh obj9 = new HocSinh("Nguyễn Văn I", "Thợ xây", "ABC", "0123456781");
        lstHocSinh.add(obj9);

        HocSinh obj10 = new HocSinh("Nguyễn Văn J", "Thợ xây", "ABC", "0123456780");
        lstHocSinh.add(obj10);

        HocSinh obj11 = new HocSinh("Doãn Chí B1", "Kiếm sĩ", "Toàn chân giáo", "1234567890");
        lstHocSinh.add(obj11);

        HocSinh obj12 = new HocSinh("Doãn Chí B2", "Kiếm sĩ", "Toàn chân giáo", "1234567891");
        lstHocSinh.add(obj12);

        HocSinh obj13 = new HocSinh("Doãn Chí B3", "Kiếm sĩ", "Toàn chân giáo", "1234567892");
        lstHocSinh.add(obj13);

        HocSinh obj14 = new HocSinh("Doãn Chí B4", "Kiếm sĩ", "Toàn chân giáo", "1234567893");
        lstHocSinh.add(obj14);

        HocSinh obj15 = new HocSinh("Doãn Chí B5", "Kiếm sĩ", "Toàn chân giáo", "1234567894");
        lstHocSinh.add(obj15);

        HocSinh obj16 = new HocSinh("Doãn Chí B6", "Kiếm sĩ", "Toàn chân giáo", "1234567895");
        lstHocSinh.add(obj16);

        HocSinh obj17 = new HocSinh("Doãn Chí B7", "Kiếm sĩ", "Toàn chân giáo", "1234567896");
        lstHocSinh.add(obj17);

        HocSinh obj18 = new HocSinh("Doãn Chí B8", "Kiếm sĩ", "Toàn chân giáo", "1234567897");
        lstHocSinh.add(obj18);

        HocSinh obj19 = new HocSinh("Doãn Chí B9", "Kiếm sĩ", "Toàn chân giáo", "1234567898");
        lstHocSinh.add(obj19);

        HocSinh obj20 = new HocSinh("Doãn Chí B10", "Kiếm sĩ", "Toàn chân giáo", "1234567899");
        lstHocSinh.add(obj20);

        HocSinh obj21 = new HocSinh("Lý Mạc S1", "Ni cô", "Cổ mộ", "0111111111");
        lstHocSinh.add(obj21);

        HocSinh obj22 = new HocSinh("Lý Mạc S2", "Ni cô", "Cổ mộ", "1111111111");
        lstHocSinh.add(obj22);

        HocSinh obj23 = new HocSinh("Lý Mạc S3", "Ni cô", "Cổ mộ", "2111111111");
        lstHocSinh.add(obj23);

        HocSinh obj24 = new HocSinh("Lý Mạc S4", "Ni cô", "Cổ mộ", "3111111111");
        lstHocSinh.add(obj24);

        HocSinh obj25 = new HocSinh("Lý Mạc S5", "Ni cô", "Cổ mộ", "4111111111");
        lstHocSinh.add(obj25);

        HocSinh obj26 = new HocSinh("Lý Mạc S6", "Ni cô", "Cổ mộ", "5111111111");
        lstHocSinh.add(obj26);

        HocSinh obj27 = new HocSinh("Lý Mạc S7", "Ni cô", "Cổ mộ", "6111111111");
        lstHocSinh.add(obj27);

        HocSinh obj28 = new HocSinh("Lý Mạc S8", "Ni cô", "Cổ mộ", "7111111111");
        lstHocSinh.add(obj28);

        HocSinh obj29 = new HocSinh("Lý Mạc S9", "Ni cô", "Cổ mộ", "8111111111");
        lstHocSinh.add(obj29);

        HocSinh obj30 = new HocSinh("Lý Mạc S10", "Ni cô", "Cổ mộ", "9111111111");
        lstHocSinh.add(obj30);

        HocSinh obj31 = new HocSinh("Lâm Sung1", "Chịu", "Lương sơn bạc", "1111111110");
        lstHocSinh.add(obj31);

        HocSinh obj32 = new HocSinh("Lâm Sung2", "Chịu", "Lương sơn bạc", "1111111111");
        lstHocSinh.add(obj32);

        HocSinh obj33 = new HocSinh("Lâm Sung3", "Chịu", "Lương sơn bạc", "1111111112");
        lstHocSinh.add(obj33);

        HocSinh obj34 = new HocSinh("Lâm Sung4", "Chịu", "Lương sơn bạc", "1111111113");
        lstHocSinh.add(obj34);

        HocSinh obj35 = new HocSinh("Lâm Sung5", "Chịu", "Lương sơn bạc", "1111111114");
        lstHocSinh.add(obj35);

        HocSinh obj36 = new HocSinh("Lâm Sung6", "Chịu", "Lương sơn bạc", "1111111115");
        lstHocSinh.add(obj36);

        HocSinh obj37 = new HocSinh("Lâm Sung7", "Chịu", "Lương sơn bạc", "1111111116");
        lstHocSinh.add(obj37);

        HocSinh obj38 = new HocSinh("Lâm Sung8", "Chịu", "Lương sơn bạc", "1111111117");
        lstHocSinh.add(obj38);

        HocSinh obj39 = new HocSinh("Lâm Sung9", "Chịu", "Lương sơn bạc", "1111111118");
        lstHocSinh.add(obj39);

        HocSinh obj40 = new HocSinh("Lâm Sung10", "Chịu", "Lương sơn bạc", "1111111119");
        lstHocSinh.add(obj40);

        HocSinh obj41 = new HocSinh("Võ Tòng1", "Đập hổ", "Lương sơn bạc", "2222222220");
        lstHocSinh.add(obj41);

        HocSinh obj42 = new HocSinh("Võ Tòng2", "Đập hổ", "Lương sơn bạc", "2222222221");
        lstHocSinh.add(obj42);

        HocSinh obj43 = new HocSinh("Võ Tòng3", "Đập hổ", "Lương sơn bạc", "2222222222");
        lstHocSinh.add(obj43);

        HocSinh obj44 = new HocSinh("Võ Tòng4", "Đập hổ", "Lương sơn bạc", "2222222223");
        lstHocSinh.add(obj44);

        HocSinh obj45 = new HocSinh("Võ Tòng5", "Đập hổ", "Lương sơn bạc", "2222222224");
        lstHocSinh.add(obj45);

        HocSinh obj46 = new HocSinh("Võ Tòng6", "Đập hổ", "Lương sơn bạc", "2222222225");
        lstHocSinh.add(obj46);

        HocSinh obj47 = new HocSinh("Võ Tòng7", "Đập hổ", "Lương sơn bạc", "2222222226");
        lstHocSinh.add(obj47);

        HocSinh obj48 = new HocSinh("Võ Tòng8", "Đập hổ", "Lương sơn bạc", "2222222227");
        lstHocSinh.add(obj48);

        HocSinh obj49 = new HocSinh("Võ Tòng9", "Đập hổ", "Lương sơn bạc", "2222222228");
        lstHocSinh.add(obj49);

        HocSinh obj50 = new HocSinh("Võ Tòng10", "Đập hổ", "Lương sơn bạc", "2222222229");
        lstHocSinh.add(obj50);

    }

    public List<HocSinh> LayDanhSachHS() {
        return lstHocSinh;
    }

    public void ThemMoiHS(HocSinh objHS) {
        if (objHS != null) {
            lstHocSinh.add(objHS);
        }
    }

    public void SuaThongTinHS(HocSinh objHocSinhMoi) {
        int i = 0;
        for (HocSinh hs : lstHocSinh) {
            lstHocSinh.set(i, objHocSinhMoi);
            i++;
            return;
        }
    }

    public void XoaHS(int index) {
        if (lstHocSinh.size() > 0) {
            lstHocSinh.remove(index);
        }
    }
}
