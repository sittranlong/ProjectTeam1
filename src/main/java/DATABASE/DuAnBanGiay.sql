CREATE DATABASE DuAnBanGiay
GO
USE DuAnBanGiay
GO

CREATE TABLE TAIKHOAN(
	Mataikhoan nvarchar(50) PRIMARY KEY,
	Tentaikhoan nvarchar(50),
	Chucvu nvarchar(50),
	Pass nvarchar(50),
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1

)

CREATE TABLE KHACHHANG(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Makh nvarchar(50),
	Ten nvarchar(50),
	Diachi nvarchar(100),
	Sdt nvarchar(50),
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)


CREATE TABLE NHANVIEN(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MataiKhoan nvarchar(50) foreign key references TAIKHOAN(Mataikhoan),
	Manv nvarchar(50) ,
	Ten nvarchar(50),
	Diachi nvarchar(100),
	Gioitinh nvarchar(10),
	Ngaysinh date ,
	email nvarchar(50),
	sdt nvarchar(50),
	luong int ,
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)



CREATE TABLE SANPHAM(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Masp nvarchar(50),
	Ten nvarchar(50),
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)

CREATE TABLE HOADON(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Idkh UNIQUEIDENTIFIER  foreign key references KHACHHANG(ID),
	Idnv UNIQUEIDENTIFIER foreign key references NHANVIEN(ID),
	Mahd nvarchar(50),
	Ngaytao date,
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)

CREATE TABLE DEGIAY(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Made nvarchar(50),
	Chatlieude nvarchar(50),
	Docaode int,
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)


CREATE TABLE MAUSAC(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Tenmau nvarchar(50),
	Mamau nvarchar(50),
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)


CREATE TABLE KIEUDANG(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Tenkieu nvarchar(50),
	Makieu nvarchar(50),
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)

CREATE TABLE SIZE(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Tensize int,
	Masize nvarchar(50),
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)
CREATE TABLE CHITIETSANPHAM (
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Idsp  UNIQUEIDENTIFIER foreign key references SANPHAM(ID),
	Idms UNIQUEIDENTIFIER  foreign key references MAUSAC(ID),
	Idkieu UNIQUEIDENTIFIER foreign key references KIEUDANG(ID),
	Idsize UNIQUEIDENTIFIER  foreign key references SIZE(ID),
	Idde UNIQUEIDENTIFIER  foreign key references DEGIAY(ID),
	Mactsp nvarchar(50),
	Hinhanh nvarchar(max),
	Soluong int ,
	Dongia int,
	Mota nvarchar(50),
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
	Trangthai int ,
)

CREATE TABLE HOADONCHITIET(
	Id UNIQUEIDENTIFIER  PRIMARY KEY  ,
	Idhd UNIQUEIDENTIFIER foreign key references HOADON(ID),
	Idctsp  UNIQUEIDENTIFIER foreign key references CHITIETSANPHAM(ID),
	Soluong int , 
	Tongtien int ,
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)

CREATE TABLE DOIHANG(
	Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	Idhdct UNIQUEIDENTIFIER foreign key references HOADONCHITIET(Id),
	Idnv  UNIQUEIDENTIFIER foreign key references NHANVIEN(ID),
	Idkh UNIQUEIDENTIFIER foreign key references KHACHHANG(ID),
	Ngaydoitra date,
	Soluong int,
	Lydo nvarchar(100),
    NgayTao DATETIME DEFAULT GETDATE(),
    NgayChinhSua DATETIME DEFAULT GETDATE(),
    TrangThai INT DEFAULT 1
)


insert into TAIKHOAN values
('TK3','TAIKHOAN3','QUANLY','PASS3', GETDATE(), GETDATE(), 1),
('TK1','TAIKHOAN1','NHANVIEN','PASS1', GETDATE(), GETDATE(), 1),
('TK2','TAIKHOAN2','NHANVIEN','PASS2', GETDATE(), GETDATE(), 1)

 insert into KHACHHANG values 
 (newid(),'KH01','ANH','HA NOI',0384647364, GETDATE(), GETDATE(), 1),
 (newid(),'KH02','ANH','HA NOI',0384647364, GETDATE(), GETDATE(), 1);

  insert into NHANVIEN values   
  (newid(),'TK1','NV01','LINH','HA NOI','NAM','10-09-1990','ANH98@GMAIL.COM',0384647364,200000, GETDATE(), GETDATE(),1),
 (newid(),'TK2','NV02','ANH2','HA NOI','NAM','10-09-1990','ANH98@GMAIL.COM',0384647364,200000, GETDATE(), GETDATE(),1);

 INSERT INTO SANPHAM values 
 (NEWID (),'SP01','SAN PHAM 1',GETDATE(), GETDATE(), 1),
(NEWID (),'SP02','SAN PHAM 2',GETDATE(), GETDATE(), 1)

insert into HOADON(idkh,idnv,mahd,ngaytao,TrangThai)
select top 1  kh.Id, nv.Id,'HD2', '2-9-2022',1 from KHACHHANG kh, NHANVIEN nv  where kh.Makh = 'KH02' AND nv.Manv = 'NV02'

insert into DEGIAY values 
(NEWID(),'MD01','Cao su',3,GETDATE(), GETDATE(), 1),
(NEWID(),'MD02','nhua',5,GETDATE(), GETDATE(), 1)

insert into MAUSAC values 
(NEWID(),'Mau 1','MM1',GETDATE(), GETDATE(), 1),
(NEWID(),'Mau 2','MM2',GETDATE(), GETDATE(), 1)

insert into KIEUDANG values 
(NEWID(),'KIEU 1','MK1',GETDATE(), GETDATE(), 1),
(NEWID(),'KIEU 2','MK2',GETDATE(), GETDATE(), 1)

insert into SIZE values 
(NEWID(),1,'MS1',GETDATE(), GETDATE(), 1),
(NEWID(),20,'MS2',GETDATE(), GETDATE(), 1)

SELECT 
    CTSP.MACTSP, 
    SP.TENSANPHAM, 
    S.SIZE, 
    S.MAUSAC, 
    DG.DOCAODE, 
    KD.KIEUDANG, 
    CTSP.SOLUONG, 
    CTSP.DONGIA, 
    CTSP.ID   
FROM 
    CHITIETSANPHAM CTSP 
INNER JOIN 
    KIEUDANG KD ON CTSP.Idkieu = KD.Id 
INNER JOIN 
    SANPHAM SP ON CTSP.Idsp = SP.Id 
INNER JOIN 
    SIZE S ON CTSP.Idsize = S.Id
INNER JOIN 
    DEGIAY DG ON CTSP.Idde = DG.Id; -- Thêm kết nối với bảng DEGIAY để lấy độ cao đế


insert into CHITIETSANPHAM(Idsp,idms,idkieu,idsize,idde,Mactsp,hinhanh,soluong,dongia,mota,trangthai)
select top 1  sp.id,ms.id,kd.id,sz.id,de.id,'CTSP1','Hoang',30,40000,'hang tot',1  from SANPHAM sp,MAUSAC ms,KIEUDANG kd, SIZE sz,DEGIAY de where sp.Masp='SP02' AND ms.Mamau='MM2' AND kd.Makieu= 'MK2'and sz.Masize = 'MS2'AND de.Made = 'MD02'

insert into HOADONCHITIET 
(id,idhd,idctsp,soluong,tongtien)
select top 1  NEWID(),hd.id,ctsp.id,4,300000 from HOADON hd,CHITIETSANPHAM ctsp where hd.Mahd='HD2' AND ctsp.Mactsp='CTSP2'

select * from nhanvien
select *from khachhang
select * from SANPHAM
select * from CHITIETSANPHAM
select * from HOADONCHITIET
select * from KHACHHANG
select * from TAIKHOAN
select *from NHANVIEN

SELECT*FROM HOADON
delete from chitietsanpham