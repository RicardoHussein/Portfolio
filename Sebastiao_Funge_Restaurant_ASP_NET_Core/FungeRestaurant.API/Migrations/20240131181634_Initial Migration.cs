using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace FungeRestaurant.API.Migrations
{
    /// <inheritdoc />
    public partial class InitialMigration : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "SEBASTIAO_RESTAURANT_Countries",
                columns: table => new
                {
                    countryID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    designation = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    RegistrationDateTime = table.Column<DateTime>(type: "datetime2", nullable: false),
                    Registrator = table.Column<string>(type: "nvarchar(max)", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_SEBASTIAO_RESTAURANT_Countries", x => x.countryID);
                });

            migrationBuilder.CreateTable(
                name: "SEBASTIAO_RESTAURANT_Customers",
                columns: table => new
                {
                    CustomerID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    customerName = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    address = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    cellphone = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    RegistrationDateTime = table.Column<DateTime>(type: "datetime2", nullable: false),
                    Registrator = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Email = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    countryID = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_SEBASTIAO_RESTAURANT_Customers", x => x.CustomerID);
                    table.ForeignKey(
                        name: "FK_SEBASTIAO_RESTAURANT_Customers_SEBASTIAO_RESTAURANT_Countries_countryID",
                        column: x => x.countryID,
                        principalTable: "SEBASTIAO_RESTAURANT_Countries",
                        principalColumn: "countryID");
                });

            migrationBuilder.CreateIndex(
                name: "IX_SEBASTIAO_RESTAURANT_Customers_countryID",
                table: "SEBASTIAO_RESTAURANT_Customers",
                column: "countryID");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "SEBASTIAO_RESTAURANT_Customers");

            migrationBuilder.DropTable(
                name: "SEBASTIAO_RESTAURANT_Countries");
        }
    }
}
