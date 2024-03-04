using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace FungeRestaurant.API.Migrations
{
    /// <inheritdoc />
    public partial class InitialMigration1 : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "SEBASTIAO_RESTAURANT_Products",
                columns: table => new
                {
                    ProductID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    designation = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    description = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    price = table.Column<double>(type: "float", nullable: false),
                    ImageName = table.Column<string>(type: "nvarchar(max)", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_SEBASTIAO_RESTAURANT_Products", x => x.ProductID);
                });

            migrationBuilder.CreateTable(
                name: "SEBASTIAO_RESTAURANT_Restaurants",
                columns: table => new
                {
                    RestaurantID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    RestaurantAddress = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    RegistrationDateTime = table.Column<DateTime>(type: "datetime2", nullable: false),
                    Registrator = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    countryID = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_SEBASTIAO_RESTAURANT_Restaurants", x => x.RestaurantID);
                    table.ForeignKey(
                        name: "FK_SEBASTIAO_RESTAURANT_Restaurants_SEBASTIAO_RESTAURANT_Countries_countryID",
                        column: x => x.countryID,
                        principalTable: "SEBASTIAO_RESTAURANT_Countries",
                        principalColumn: "countryID");
                });

            migrationBuilder.CreateIndex(
                name: "IX_SEBASTIAO_RESTAURANT_Restaurants_countryID",
                table: "SEBASTIAO_RESTAURANT_Restaurants",
                column: "countryID");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "SEBASTIAO_RESTAURANT_Products");

            migrationBuilder.DropTable(
                name: "SEBASTIAO_RESTAURANT_Restaurants");
        }
    }
}
