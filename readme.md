# SPRING CLOUD EUREKA SERVER DEMO

## 1. Định nghĩa:
 - Một service muốn gọi đến một service khác phải biết được service đích có hoạt động hay không
 - Bắt buộc hai service đó phải đăng ký vào một con Service Registration
 - Các service muốn đăng ký dịch vụ này phải sử dụng annotaion @EnableEurekaServer
 - Service Registration sẽ có nhiệm vụ khám phá (Discovered) xem có service nào bị down hay không
 - Eureka Server: Dùng để đăng ký các dịch vụ, hủy đăng ký các dịch vụ và tìm ra địa chỉ cũng như trạng thái của các service khác
 - Eureka Client: Là các ứng dụng hoặc microservice đã sẵn sàng để làm việc và đăng ký vào các eureka server

## 2. Các bước thực hiện demo
 - Bước 1: Vào folder replica
 - Bước 2: Tạo 3 file .bat để thực thi lệnh java -jar (đỡ phải sử dụng 3 command prompt và gõ lần lượt)
 - Bước 3: Lưu lần lượt các câu lệnh sau vào 3 file .bat (-Dspring.profiles.active là đọc lần lượt các profile trong cấu hình):
    + java -jar -Dspring.profiles.active=united-states eurekeserverexample-0.0.1-SNAPSHOT.jar
    + java -jar -Dspring.profiles.active=france eurekeserverexample-0.0.1-SNAPSHOT.jar
    + java -jar -Dspring.profiles.active=vietnam eurekeserverexample-0.0.1-SNAPSHOT.jar
 - Bước 4: Mở file .bat

## 3. Các config cần lưu ý:
 eureka.instance.hostname: Hostname của eureka
 eureka.client.registerWithEureka: Có đăng ký vào Service Registration hay không
 eureka.client.fetchRegistry: 
 eureka.client.service-url.defaultZone: 

## 4. Các môi trường:
 - Server: my-eureka-server.com
 - VN: http://localhost:9001/ (my-eureka-server-vn.com:9001)
 - FR: http://localhost:9002/ (my-eureka-server-fr.com:9002)
 - US: http://localhost:9003/ (my-eureka-server-us.com:9003)

## 5. Cấu hình file host:
127.0.0.1 my-eureka-server.com
127.0.0.1 my-eureka-server-us.com
127.0.0.1 my-eureka-server-fr.com
127.0.0.1 my-eureka-server-vn.com
