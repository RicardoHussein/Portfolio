using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace FungeRestaurant.API.Models
{
    [Table("SEBASTIAO_RESTAURANT_Users")]
    public class User
    {
        [System.ComponentModel.DataAnnotations.Key]
        //[DatabaseGenerated(DatabaseGeneratedOption.None)]
        [Display(Name = "User ID")]
        public int UserID { get; set; }

        //[Required]
        [Display(Name = "UserName")]
        public String UserName { get; set; }

        //[Required]
        [Display(Name = "Password")]
        public String Password { get; set; }

        [Display(Name = "Email")]
        [EmailAddress]
        public string Email { get; set; }
    }
}
