package session06;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScoreManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] scores = null;

        int choice;

        do {

            System.out.println("\n*********** QUẢN LÝ ĐIỂM SV ************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê SV giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = sc.nextInt();

                    scores = new double[n];

                    for (int i = 0; i < n; i++) {

                        do {

                            System.out.print("Nhập điểm SV thứ "
                                    + (i + 1) + ": ");

                            scores[i] = sc.nextDouble();

                            if (scores[i] < 0 || scores[i] > 10) {

                                System.out.println("Điểm phải từ 0 -> 10!");
                            }

                        } while (scores[i] < 0 || scores[i] > 10);
                    }

                    System.out.println("Nhập danh sách thành công!");

                    break;

                case 2:

                    if (scores == null) {

                        System.out.println("Chưa có dữ liệu!");

                    } else {

                        System.out.println("Danh sách điểm:");

                        for (int i = 0; i < scores.length; i++) {

                            System.out.println("SV "
                                    + (i + 1)
                                    + ": "
                                    + scores[i]);
                        }
                    }

                    break;

                case 3:

                    if (scores == null) {

                        System.out.println("Chưa có dữ liệu!");

                    } else {

                        double sum = 0;

                        for (double score : scores) {

                            sum += score;
                        }

                        double avg = sum / scores.length;

                        System.out.println("Điểm trung bình: " + avg);
                    }

                    break;

                case 4:

                    if (scores == null) {

                        System.out.println("Chưa có dữ liệu!");

                    } else {

                        double max = scores[0];
                        double min = scores[0];

                        for (double score : scores) {

                            if (score > max) {

                                max = score;
                            }

                            if (score < min) {

                                min = score;
                            }
                        }

                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }

                    break;

                case 5:

                    if (scores == null) {

                        System.out.println("Chưa có dữ liệu!");

                    } else {

                        int pass = 0;
                        int fail = 0;

                        for (double score : scores) {

                            if (score >= 5) {

                                pass++;

                            } else {

                                fail++;
                            }
                        }

                        System.out.println("Số SV đạt: " + pass);
                        System.out.println("Số SV trượt: " + fail);
                    }

                    break;

                case 6:

                    if (scores == null) {

                        System.out.println("Chưa có dữ liệu!");

                    } else {

                        Arrays.sort(scores);

                        System.out.println("Danh sách sau sắp xếp:");

                        for (double score : scores) {

                            System.out.print(score + " ");
                        }

                        System.out.println();
                    }

                    break;

                case 7:

                    if (scores == null) {

                        System.out.println("Chưa có dữ liệu!");

                    } else {

                        int good = 0;
                        int excellent = 0;

                        for (double score : scores) {

                            // Giỏi: 8 -> dưới 9
                            if (score >= 8 && score < 9) {

                                good++;
                            }

                            // Xuất sắc: >= 9
                            if (score >= 9) {

                                excellent++;
                            }
                        }

                        System.out.println("Số SV giỏi: " + good);
                        System.out.println("Số SV xuất sắc: " + excellent);
                    }

                    break;

                case 8:

                    System.out.println("Thoát chương trình...");

                    break;

                default:

                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 8);

        sc.close();
    }
}