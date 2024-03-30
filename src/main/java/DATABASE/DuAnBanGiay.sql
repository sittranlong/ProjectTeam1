USE [master]
GO
/****** Object:  Database [DuAnBanGiay]    Script Date: 30/03/2024 16:21:32 ******/
CREATE DATABASE [DuAnBanGiay]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'DuAnBanGiay', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\DuAnBanGiay.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'DuAnBanGiay_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\DuAnBanGiay_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [DuAnBanGiay] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DuAnBanGiay].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DuAnBanGiay] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET ARITHABORT OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [DuAnBanGiay] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [DuAnBanGiay] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [DuAnBanGiay] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET  ENABLE_BROKER 
GO
ALTER DATABASE [DuAnBanGiay] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [DuAnBanGiay] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [DuAnBanGiay] SET  MULTI_USER 
GO
ALTER DATABASE [DuAnBanGiay] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [DuAnBanGiay] SET DB_CHAINING OFF 
GO
ALTER DATABASE [DuAnBanGiay] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [DuAnBanGiay] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [DuAnBanGiay] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [DuAnBanGiay] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [DuAnBanGiay] SET QUERY_STORE = OFF
GO
USE [DuAnBanGiay]
GO
/****** Object:  Table [dbo].[CHITIETSANPHAM]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CHITIETSANPHAM](
	[Id] [uniqueidentifier] NOT NULL,
	[Idsp] [uniqueidentifier] NULL,
	[Idms] [uniqueidentifier] NULL,
	[Idkieu] [uniqueidentifier] NULL,
	[Idsize] [uniqueidentifier] NULL,
	[Idde] [uniqueidentifier] NULL,
	[Mactsp] [nvarchar](50) NULL,
	[Hinhanh] [nvarchar](max) NULL,
	[Soluong] [int] NULL,
	[Dongia] [int] NULL,
	[Mota] [nvarchar](50) NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[Trangthai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DEGIAY]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DEGIAY](
	[Id] [uniqueidentifier] NOT NULL,
	[Made] [nvarchar](50) NULL,
	[Chatlieude] [nvarchar](50) NULL,
	[Docaode] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DOIHANG]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DOIHANG](
	[Id] [uniqueidentifier] NOT NULL,
	[Idhdct] [uniqueidentifier] NULL,
	[Idnv] [uniqueidentifier] NULL,
	[Idkh] [uniqueidentifier] NULL,
	[Ngaydoitra] [date] NULL,
	[Soluong] [int] NULL,
	[Lydo] [nvarchar](100) NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HOADON]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOADON](
	[Id] [uniqueidentifier] NOT NULL,
	[Idkh] [uniqueidentifier] NULL,
	[Idnv] [uniqueidentifier] NULL,
	[Mahd] [nvarchar](50) NULL,
	[Ngaytao] [date] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HOADONCHITIET]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOADONCHITIET](
	[Id] [uniqueidentifier] NOT NULL,
	[Idhd] [uniqueidentifier] NULL,
	[Idctsp] [uniqueidentifier] NULL,
	[Soluong] [int] NULL,
	[Tongtien] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACHHANG](
	[Id] [uniqueidentifier] NOT NULL,
	[Makh] [nvarchar](50) NULL,
	[Ten] [nvarchar](50) NULL,
	[Diachi] [nvarchar](100) NULL,
	[Sdt] [nvarchar](50) NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KIEUDANG]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KIEUDANG](
	[Id] [uniqueidentifier] NOT NULL,
	[Tenkieu] [nvarchar](50) NULL,
	[Makieu] [nvarchar](50) NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MAUSAC]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MAUSAC](
	[Id] [uniqueidentifier] NOT NULL,
	[Tenmau] [nvarchar](50) NULL,
	[Mamau] [nvarchar](50) NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHANVIEN](
	[Id] [uniqueidentifier] NOT NULL,
	[MataiKhoan] [nvarchar](50) NULL,
	[Manv] [nvarchar](50) NULL,
	[Ten] [nvarchar](50) NULL,
	[Diachi] [nvarchar](100) NULL,
	[Gioitinh] [nvarchar](10) NULL,
	[Ngaysinh] [date] NULL,
	[email] [nvarchar](50) NULL,
	[sdt] [nvarchar](50) NULL,
	[luong] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SANPHAM]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SANPHAM](
	[Id] [uniqueidentifier] NOT NULL,
	[Masp] [nvarchar](50) NULL,
	[Ten] [nvarchar](50) NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SIZE]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SIZE](
	[Id] [uniqueidentifier] NOT NULL,
	[Tensize] [int] NULL,
	[Masize] [nvarchar](50) NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TAIKHOAN]    Script Date: 30/03/2024 16:21:32 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TAIKHOAN](
	[Mataikhoan] [nvarchar](50) NOT NULL,
	[Tentaikhoan] [nvarchar](50) NULL,
	[Chucvu] [nvarchar](50) NULL,
	[Pass] [nvarchar](50) NULL,
	[NgayTao] [datetime] NULL,
	[NgayChinhSua] [datetime] NULL,
	[TrangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Mataikhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[CHITIETSANPHAM] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[CHITIETSANPHAM] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[CHITIETSANPHAM] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[DEGIAY] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[DEGIAY] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[DEGIAY] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[DEGIAY] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[DOIHANG] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[DOIHANG] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[DOIHANG] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[DOIHANG] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[HOADON] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[HOADON] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[HOADON] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[HOADONCHITIET] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[HOADONCHITIET] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[HOADONCHITIET] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[KHACHHANG] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[KHACHHANG] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[KHACHHANG] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[KHACHHANG] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[KIEUDANG] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[KIEUDANG] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[KIEUDANG] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[KIEUDANG] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[MAUSAC] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[MAUSAC] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[MAUSAC] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[MAUSAC] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[NHANVIEN] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[NHANVIEN] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[NHANVIEN] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[NHANVIEN] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[SANPHAM] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[SANPHAM] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[SANPHAM] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[SANPHAM] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[SIZE] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[SIZE] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[SIZE] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[SIZE] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[TAIKHOAN] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[TAIKHOAN] ADD  DEFAULT (getdate()) FOR [NgayChinhSua]
GO
ALTER TABLE [dbo].[TAIKHOAN] ADD  DEFAULT ((1)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[CHITIETSANPHAM]  WITH CHECK ADD FOREIGN KEY([Idkieu])
REFERENCES [dbo].[KIEUDANG] ([Id])
GO
ALTER TABLE [dbo].[CHITIETSANPHAM]  WITH CHECK ADD FOREIGN KEY([Idsize])
REFERENCES [dbo].[SIZE] ([Id])
GO
ALTER TABLE [dbo].[CHITIETSANPHAM]  WITH CHECK ADD FOREIGN KEY([Idde])
REFERENCES [dbo].[DEGIAY] ([Id])
GO
ALTER TABLE [dbo].[CHITIETSANPHAM]  WITH CHECK ADD FOREIGN KEY([Idms])
REFERENCES [dbo].[MAUSAC] ([Id])
GO
ALTER TABLE [dbo].[CHITIETSANPHAM]  WITH CHECK ADD FOREIGN KEY([Idsp])
REFERENCES [dbo].[SANPHAM] ([Id])
GO
ALTER TABLE [dbo].[DOIHANG]  WITH CHECK ADD FOREIGN KEY([Idhdct])
REFERENCES [dbo].[HOADONCHITIET] ([Id])
GO
ALTER TABLE [dbo].[DOIHANG]  WITH CHECK ADD FOREIGN KEY([Idkh])
REFERENCES [dbo].[KHACHHANG] ([Id])
GO
ALTER TABLE [dbo].[DOIHANG]  WITH CHECK ADD FOREIGN KEY([Idnv])
REFERENCES [dbo].[NHANVIEN] ([Id])
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD FOREIGN KEY([Idkh])
REFERENCES [dbo].[KHACHHANG] ([Id])
GO
ALTER TABLE [dbo].[HOADON]  WITH CHECK ADD FOREIGN KEY([Idnv])
REFERENCES [dbo].[NHANVIEN] ([Id])
GO
ALTER TABLE [dbo].[HOADONCHITIET]  WITH CHECK ADD FOREIGN KEY([Idctsp])
REFERENCES [dbo].[CHITIETSANPHAM] ([Id])
GO
ALTER TABLE [dbo].[HOADONCHITIET]  WITH CHECK ADD FOREIGN KEY([Idhd])
REFERENCES [dbo].[HOADON] ([Id])
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD FOREIGN KEY([MataiKhoan])
REFERENCES [dbo].[TAIKHOAN] ([Mataikhoan])
GO
USE [master]
GO
ALTER DATABASE [DuAnBanGiay] SET  READ_WRITE 
GO
