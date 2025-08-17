import { FaBoxOpen, FaHome, FaShoppingCart, FaStore, FaThList } from "react-icons/fa";
import { bannerImageOne, bannerImageThree, bannerImageTwo } from "./constant";

export const bannerLists = [
    {
        id: 1,
        image: bannerImageOne,
        title: " Best Mobiles",
        subtitle: " Electronic Items",
        description: "Premium Phones, Stellar Prices",
      },
      {
        id: 2,
        image: bannerImageTwo,
        title: "Upgrade to Innovation",
        subtitle: "Smart TV",
        description: "Experience the latest in home entertainment",
      },
      {
        id: 3,
        image: bannerImageThree,
        title: "Trust That Travels With You",
        subtitle: "Electronics",
        description: "Trusted by Thousands, Powered by Service.",
    }
];


export const adminNavigation = [
  {
    name: "Dashboard", 
    href: "/admin", 
    icon: FaHome, 
    current: true 
  }, {
    name: "Orders", 
    href: "/admin/orders", 
    icon: FaShoppingCart
  }, {
    name: "Products", 
    href: "/admin/products", 
    icon: FaBoxOpen
  }, {
    name: "Categories", 
    href: "/admin/categories", 
    icon: FaThList
  }, {
    name: "Sellers", 
    href: "/admin/sellers", 
    icon: FaStore 
  }
];


export const sellerNavigation = [
  {
    name: "Orders", 
    href: "/admin/orders", 
    icon: FaShoppingCart,
    current: true 
  }, {
    name: "Products", 
    href: "/admin/products", 
    icon: FaBoxOpen
  }
];