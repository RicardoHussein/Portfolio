using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace FungeRestaurant.API.Migrations
{
    /// <inheritdoc />
    public partial class InitialMigration2 : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "SEBASTIAO_RESTAURANT_Salespeople",
                columns: table => new
                {
                    SalespersonID = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    SalespersonName = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    cellphone = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    Email = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    SalespersonAddress = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    RegistrationDateTime = table.Column<DateTime>(type: "datetime2", nullable: false),
                    Registrator = table.Column<string>(type: "nvarchar(max)", nullable: false),
                    countryID = table.Column<int>(type: "int", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_SEBASTIAO_RESTAURANT_Salespeople", x => x.SalespersonID);
                    table.ForeignKey(
                        name: "FK_SEBASTIAO_RESTAURANT_Salespeople_SEBASTIAO_RESTAURANT_Countries_countryID",
                        column: x => x.countryID,
                        principalTable: "SEBASTIAO_RESTAURANT_Countries",
                        principalColumn: "countryID");
                });

            migrationBuilder.CreateIndex(
                name: "IX_SEBASTIAO_RESTAURANT_Salespeople_countryID",
                table: "SEBASTIAO_RESTAURANT_Salespeople",
                column: "countryID");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "SEBASTIAO_RESTAURANT_Salespeople");
        }
    }
}
