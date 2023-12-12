package petmvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Petproject {
    public static void main(String[] args) {
        List<Petinfo> info=new ArrayList<>();
        List<Petrecord> details=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("===애완동물진료관리시스템===");
        System.out.println("1. 신규 고객 정보 입력");
        System.out.println("2. 진료 기록 저장");
        System.out.println("3. 진료 기록 조회");
        System.out.println("4. 진료 기록 삭제");
        System.out.println("5. 종료");



        System.out.print("원하는 기능을 선택하세요 :");
        Changenumber number = new Changenumber(scanner.nextInt());
        scanner.nextLine();


        while(number.getNumbers()!=5) {

            switch (number.getNumbers()) {
                case 1:
                    System.out.println("신규 고객 정보를 입력하세요.");
                    System.out.print("전화번호:");
                    String phone = scanner.nextLine();

                    System.out.print("소유주 이름:");
                    String person = scanner.nextLine();

                    System.out.print("동물 이름:");
                    String petname = scanner.nextLine();

                    System.out.print("주소:");
                    String address = scanner.nextLine();

                    System.out.print("종류:");
                    String kinds = scanner.nextLine();

                    System.out.print("출생년도:");
                    String birth = scanner.nextLine();

                    Petinfo member = new Petinfo(phone, person, petname, address, kinds, birth);
                    info.add(member);

                    System.out.println("고객 정보가 추가되었습니다.");


                    break;

                case 2:
                    System.out.print("전화번호를 입력하세요:");
                    String phonenumber = scanner.nextLine();

                    System.out.print("진료일을 입력하세요:");
                    String date = scanner.nextLine();

                    System.out.print("진료내용을 입력하세요:");
                    String detail = scanner.nextLine();

                    Petrecord record = new Petrecord(phonenumber, date, detail);
                    details.add(record);

                    System.out.println("진료기록이 저장되었습니다.");

                    break;

                case 3:
                    System.out.print("전화번호를 입력하세요:");
                    String keynumber = scanner.nextLine();
                    for (int j = 0; j < details.size(); j++) {
                        Petrecord petrecord = details.get(j);
                        if (keynumber == details.get(j).getPhonenumber()) {

                            for (int i = 0; i < info.size(); i++) {
                                Petinfo petinfo = info.get(i);


                                if ((keynumber == (info.get(i).getPhone()))) {
                                    System.out.println("[" + info.get(i).getPetname() + "]" + "의 진료기록");
                                    System.out.println("진료일 : " + details.get(j).getDate());
                                    System.out.println("진료내용 : " + details.get(j).getDetail());
                                    System.out.println("소유주 이름 : " + info.get(i).getPerson());
                                    System.out.println("동물 이름 : " + info.get(i).getPetname());
                                    System.out.println("주소 : " + info.get(i).getAddress());
                                    System.out.println("종류 : " + info.get(i).getKinds());
                                    System.out.println("출생년도 : " + info.get(i).getBirth());

                                }


                            }

                        }
                    }

                    break;


                case 4:
                    System.out.print("전화번호를 입력하세요:");
                    String keynumber2 = scanner.nextLine();
                    for (int i = 0; i < details.size(); i++) {
                        Petrecord petrecord = details.get(i);
                        if (keynumber2 == details.get(i).getPhonenumber()) {
                            details.remove(i);
                        }
                    }
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");

            }
            System.out.print("원하는 기능을 선택하세요 :");
           number.setNumbers(scanner.nextInt());
            scanner.nextLine();

        }
    }
}
