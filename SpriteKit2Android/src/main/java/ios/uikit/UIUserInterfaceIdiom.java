package ios.uikit;

public interface UIUserInterfaceIdiom {
    int Unspecified = -1;
    int Phone = 0;// API_AVAILABLE(ios(3.2)), // iPhone and iPod touch style UI
    int Pad = 1;//API_AVAILABLE(ios(3.2)), // iPad style UI
    int TV = 2;//API_AVAILABLE(ios(9.0)), // Apple TV style UI
    int CarPlay = 3;//API_AVAILABLE(ios(9.0)), // CarPlay style UI
    int Mac = 4;//API_AVAILABLE(ios(14.0)) = 5, // Optimized for Mac UI
}
