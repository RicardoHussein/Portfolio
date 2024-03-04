﻿// <auto-generated />
using System;
using FungeRestaurant.API.Data;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

#nullable disable

namespace FungeRestaurant.API.Migrations
{
    [DbContext(typeof(FungeRestaurantAPIContext))]
    [Migration("20240131184206_Initial Migration1")]
    partial class InitialMigration1
    {
        /// <inheritdoc />
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "8.0.1")
                .HasAnnotation("Relational:MaxIdentifierLength", 128);

            SqlServerModelBuilderExtensions.UseIdentityColumns(modelBuilder);

            modelBuilder.Entity("FungeRestaurant.API.Models.Country", b =>
                {
                    b.Property<int>("countryID")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("countryID"));

                    b.Property<DateTime>("RegistrationDateTime")
                        .HasColumnType("datetime2");

                    b.Property<string>("Registrator")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("designation")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasKey("countryID");

                    b.ToTable("SEBASTIAO_RESTAURANT_Countries");
                });

            modelBuilder.Entity("FungeRestaurant.API.Models.Customer", b =>
                {
                    b.Property<int>("CustomerID")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("CustomerID"));

                    b.Property<string>("Email")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<DateTime>("RegistrationDateTime")
                        .HasColumnType("datetime2");

                    b.Property<string>("Registrator")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("address")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("cellphone")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<int?>("countryID")
                        .HasColumnType("int");

                    b.Property<string>("customerName")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasKey("CustomerID");

                    b.HasIndex("countryID");

                    b.ToTable("SEBASTIAO_RESTAURANT_Customers");
                });

            modelBuilder.Entity("FungeRestaurant.API.Models.Product", b =>
                {
                    b.Property<int>("ProductID")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("ProductID"));

                    b.Property<string>("ImageName")
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("description")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("designation")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<double>("price")
                        .HasColumnType("float");

                    b.HasKey("ProductID");

                    b.ToTable("SEBASTIAO_RESTAURANT_Products");
                });

            modelBuilder.Entity("FungeRestaurant.API.Models.Restaurant", b =>
                {
                    b.Property<int>("RestaurantID")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("RestaurantID"));

                    b.Property<DateTime>("RegistrationDateTime")
                        .HasColumnType("datetime2");

                    b.Property<string>("Registrator")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("RestaurantAddress")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<int?>("countryID")
                        .HasColumnType("int");

                    b.HasKey("RestaurantID");

                    b.HasIndex("countryID");

                    b.ToTable("SEBASTIAO_RESTAURANT_Restaurants");
                });

            modelBuilder.Entity("FungeRestaurant.API.Models.Customer", b =>
                {
                    b.HasOne("FungeRestaurant.API.Models.Country", "country")
                        .WithMany()
                        .HasForeignKey("countryID");

                    b.Navigation("country");
                });

            modelBuilder.Entity("FungeRestaurant.API.Models.Restaurant", b =>
                {
                    b.HasOne("FungeRestaurant.API.Models.Country", "country")
                        .WithMany()
                        .HasForeignKey("countryID");

                    b.Navigation("country");
                });
#pragma warning restore 612, 618
        }
    }
}
