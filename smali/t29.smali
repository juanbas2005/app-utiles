.class public abstract Lt29;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lz97;

.field public static final b:Lg82;

.field public static final c:Lg82;

.field public static final d:Lgy2;

.field public static final e:Lns7;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lx10;->O:Lx10;

    .line 2
    .line 3
    new-instance v1, Lz97;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lz97;-><init>(Lsr2;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lt29;->a:Lz97;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-static {v0}, Lza5;->F(I)Lg82;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lt29;->b:Lg82;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-static {v0}, Lza5;->F(I)Lg82;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lt29;->c:Lg82;

    .line 23
    .line 24
    new-instance v0, Lph8;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    new-instance v1, Lgy2;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const-string v3, "main"

    .line 40
    .line 41
    invoke-direct {v1, v0, v3, v2}, Lgy2;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    sput-object v1, Lt29;->d:Lgy2;

    .line 45
    .line 46
    sget-object v0, Law1;->b:Lns7;

    .line 47
    .line 48
    sput-object v0, Lt29;->e:Lns7;

    .line 49
    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
