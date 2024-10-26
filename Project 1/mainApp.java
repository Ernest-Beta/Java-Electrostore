

import java.util.*;
import java.time.LocalDate;

class mainApp {
    public static void main(String args[]) {
        ArrayList<Order> orders = new ArrayList<Order>();
        ArrayList<Sale> sales = new ArrayList<Sale>();

        HashMap<String, HashMap<Item, Integer>> availableDevices = new HashMap<String, HashMap<Item, Integer>>();
        String[] deviceTypes = {"Tv", "Blue ray/DVD", "Camera", "Console", "Fridge", "Washinmachine"};
        
        for (int i = 0; i < deviceTypes.length; i++) {
            availableDevices.put(deviceTypes[i], new HashMap<Item, Integer>());
        }

        Item tv1 = new Tv("00001", "Samsung QLED Q90T", "Samsung", "14/05/2022", 799.99, "Plasma", "55'", "QLED", "HDMI");
        Item tv2 = new Tv("00002", "LG OLED C9", "LG", "29/11/2017", 599.99, "LED", "65'", "OLED", "DVI");
        availableDevices.get("Tv").put(tv1, 5);
        availableDevices.get("Tv").put(tv2, 0);

        Item disk1 = new Disk("Blue ray", "HD", "BD-R", "00005", "Blue ray Model1", "Sony", "05/05/2018", 4.99);
        Item disk2 = new Disk("DVD", "HD", "BD-RD", "00006", "DVD", "Sony", "23/10/2013", 10.99);
        availableDevices.get("Blue ray/DVD").put(disk1, 10);
        availableDevices.get("Blue ray/DVD").put(disk2, 1);


        Item camera1 = new Camera("00003", "Nikon D850", "Nikon", "24/08/2023", 2999.99, "DSLR", "45.7 megapixels", "x5", "x10", "8'");
        Item camera2 = new Camera("00004", "Canon EOS 5D Mark IV", "Canon", "01/12/2020", 99.99, "Action Camera", "40 megapixel", "x10", "x2", "5'");
        availableDevices.get("Camera").put(camera1, 0);
        availableDevices.get("Camera").put(camera2, 3);


        Item console1 = new Console("00007", "PlayStation 5", "Sony", "14/08/2020", 499.99, "PS5", "AMD Zen 2, 8-core", "AMD RDNA 2", "sound1", "500GB");
        Item console2 = new Console("00008", "Nintendo Switch", "Nintendo", "23/03/2017", 299.99, "Nintendo", "NVIDIA Tegra", "NVIDIA Tegra", "sound2", "32GB");
        availableDevices.get("Console").put(console1, 10);
        availableDevices.get("Console").put(console2, 0);


        Item fridge1 = new Fridge("00009", "Samsung RF23M8070SR", "Samsung", "20/02/2022", 2199.99, "one door", "A", "Medium", "Medium");
        Item fridge2 = new Fridge("00010", "LG LFXS28968S", "LG", "13/10/2023", 2399.99, "two door", "A", "Large", "Large");
        availableDevices.get("Fridge").put(fridge1, 2);
        availableDevices.get("Fridge").put(fridge2, 3);

        Item washingMachine1 = new WashingMachine("00011", "Samsung WF45R6300AV", "Samsung", "13/10/2023", 899.99, "A", "9 Kg", "1300 RPM");
        Item washingMachine2 = new WashingMachine("00012", "LG WM3700HWA", "LG", "24/04/2019", 499.99, "C", "5 Kg", "500 RPM");
        availableDevices.get("Washinmachine").put(washingMachine1, 0);
        availableDevices.get("Washinmachine").put(washingMachine2, 1);

        int saleCode = 1, orderCode = 1;
        Scanner in = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            System.out.println("=========================================================================");
            System.out.println("=============     [ Wellcome to the Device Store ]     ==================");
            System.out.println("");
            System.out.println("Please choose an option: ");
            System.out.println("0. View items");
            System.out.println("1. View orders");
            System.out.println("2. View sales");
            System.out.println("3. Exit");
            int answer = in.nextInt();
            while (answer < 0 || answer > 3) {
                System.out.println("Invalid input. Please choose a valid category (0-3): ");
                answer = in.nextInt();
            }
            

            if (answer == 0) {
                System.out.println("Choose Category: ");
                System.out.println("0. Image&Sound");
                System.out.println("1. Gaming");
                System.out.println("2. Home Devices");
                answer = in.nextInt();
                String type;

                while (answer < 0 || answer > 2) {
                    System.out.println("Invalid input. Please choose a valid category (0-2): ");
                    answer = in.nextInt();
                }

                if (answer == 0) {
                    System.out.println("Choose type: ");
                    System.out.println("0. Tv");
                    System.out.println("1. Blue ray/DVD");
                    System.out.println("2. Camera");
                    answer = in.nextInt();

                    while (answer < 0 || answer > 2) {
                        System.out.println("Invalid input. Please choose a valid type (0-2): ");
                        answer = in.nextInt();
                    }

                    type = deviceTypes[answer];
                } else if (answer == 1) {
                    System.out.println("Choose type: ");
                    System.out.println("0. Console");
                    answer = in.nextInt();

                    while (answer != 0) {
                        System.out.println("Invalid input. Please choose a valid type (0): ");
                        answer = in.nextInt();
                    }

                    type = deviceTypes[answer + 3];
                } else {
                    System.out.println("Choose type: ");
                    System.out.println("0. Fridge");
                    System.out.println("1. Washingmachine");
                    answer = in.nextInt();

                    while (answer < 0 || answer > 1) {
                        System.out.println("Invalid input. Please choose a valid type (0-1): ");
                        answer = in.nextInt();
                    }

                    type = deviceTypes[answer + 4];
                }
                //Initialization for the object x, which allways changes inside the loop
                Item x = null;
                boolean flag = true;
                while(flag){
                    
                    for (Item c : availableDevices.get(type).keySet()) {
                        Item device = c;
                        int quantity = availableDevices.get(type).get(device);
                        System.out.println(device.getCode() + "  " + device.getName() + " [Quantity: " + quantity + "]");
                    }
                    System.out.println("Select specific model: ");
                    String answer2 = in.next(); 
                    
                    for (Item c : availableDevices.get(type).keySet()) {
                    
                        if (c.getCode().equals(answer2)) {
                            x = c;
                            flag = false;
                            break;
                        }
                    }
                        if(flag){
                            System.out.println("Invalid model. Please try again.");
                        }
                }
                if (!flag) {
                    Item selectedItem = x;
                    System.out.println(selectedItem); 

                    System.out.println("Would you like to buy the selected Item? 1. Yes 2. No");
                    answer = in.nextInt();

                    while (answer < 1 || answer >2 ) {
                        System.out.println("Invalid input. Please choose a valid choice (1-2): ");
                        answer = in.nextInt();
                    }
                        if (answer == 1) {
                            if (availableDevices.get(type).get(selectedItem) > 0) {
                                System.out.println("Give your name: ");
                                in.nextLine();  // Consume the newline character
                        
                                String name = in.nextLine();
                        
                                System.out.println("Give your phone number: ");
                                String phone = in.nextLine();
                                
                                double finalprice = selectedItem.getPrice() - selectedItem.getPrice() * selectedItem.getEkpt();
                                System.out.println("This Item's price is: " + selectedItem.getPrice());
                                System.out.println("The discount is: " + selectedItem.getEkpt());
                                System.out.println("The final price is: " + finalprice);
                                
                                Sale sale = new Sale(saleCode, selectedItem, new Customer(name, phone), LocalDate.now(), finalprice);
                                sales.add(sale);
                                saleCode++;
                                
                                availableDevices.get(type).put(selectedItem, availableDevices.get(type).get(selectedItem) - 1);
                            
                            }else {
                            System.out.println("Currently not available...");
                            System.out.println("Would you like to order the selected Item? 1. Yes 2. No");
                            int answer5 = in.nextInt();
                            while (answer < 1 || answer >2 ) {
                                System.out.println("Invalid input. Please choose a valid choice (1-2): ");
                                answer = in.nextInt();
                            }
                            if (answer5 == 1) {
                                System.out.println("Give your name: ");
                                in.nextLine();
                                String name = in.nextLine();
                                System.out.println("Give your phone number: ");
                                String phone = in.nextLine();
								double finalprice= selectedItem.getPrice()-selectedItem.getPrice()*selectedItem.getEkpt();
								System.out.println("This Items price is: "+selectedItem.getPrice()+"\nThe discount is: "+selectedItem.getEkpt()+"\nThe final price is: "+finalprice);
                                Order order = new Order(orderCode, selectedItem, new Customer(name, phone), LocalDate.now(), LocalDate.now().plusDays(7),finalprice);
                                orders.add(order);
                                orderCode++;
                            }
                            }
                        }
                }
            } else if (answer == 1) {
                System.out.println("");
                if (orders.isEmpty()) {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                   No Orders made yet!                     ");
                    System.out.println("-----------------------------------------------------------");
                }else{
                    System.out.println("======================== [Orders] =========================");
                    for (int c = 0; c < orders.size(); c++) {
                        if (!orders.get(c).getIsExecuted()) {
                            System.out.println("Order code is: " + orders.get(c).getOrderCode());
                        }
                    }
                    System.out.println("===========================================================");
                    System.out.println("");

                    System.out.println("Select Order: ");
                    answer = in.nextInt();
                    System.out.println("");
                    System.out.println("======================== [Order] =========================");
                    System.out.println(orders.get(answer-1));
                    System.out.println("==========================================================");
                    System.out.println("");

                    System.out.println("1. Arrival  2. Sell");
                    int answer3 = in.nextInt();
                    if (answer3 == 2) {
                        orders.get(answer-1).setIsExecuted(true);
                        Sale sale = new Sale(saleCode, orders.get(answer-1).getDeviceOrdered(), new Customer(orders.get(answer-1).getCustomer().getName(), orders.get(answer-1).getCustomer().getPhone()), orders.get(answer-1).getExpectedArrivalDate(), orders.get(answer-1).getFinalCost());
                        sales.add(sale);
                        saleCode++;
                    } else {
                        System.out.println(orders.get(answer-1).getExpectedArrivalDate());
                    }
                }    
            } else if (answer == 2) {
                System.out.println("");
                if (sales.isEmpty()) {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                   No Sales made yet!                     ");
                    System.out.println("-----------------------------------------------------------");
                }else{
                System.out.println("======================== [Sales] =========================");
                for (int c = 0; c < sales.size(); c++) {
                    System.out.println(sales.get(c));
                    System.out.println("==========================================================");
                }
                
                System.out.println("");
            }
            }else {
                done = true;
            }
        }
    }
}
