using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace FungeRestaurant.API.Models
{
    [Table("SEBASTIAO_RESTAURANT_Orders")]
    public class Order
    {
        [System.ComponentModel.DataAnnotations.Key]
        //[DatabaseGenerated(DatabaseGeneratedOption.None)]
        [Display(Name = "Order Number")]
        public int OrderID { get; set; }

        //[Required]
        [Display(Name = "Delivery Address")]
        public String DeliveryAddress { get; set; }

        public int? RestaurantID { get; set; }

        //[Required]
        public virtual Restaurant restaurant { get; set; }

        public int? CustomerID { get; set; }

        //[Required]
        public virtual Customer customer { get; set; }

        public System.DateTime OrderDateTime { get; set; }
    }
}
