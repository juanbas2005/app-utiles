.class public final Lyl6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnu2;


# instance fields
.field public final w:Landroid/app/Service;

.field public x:Lsd1;


# direct methods
.method public constructor <init>(Landroid/app/Service;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyl6;->w:Landroid/app/Service;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lyl6;->x:Lsd1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lyl6;->w:Landroid/app/Service;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lnu2;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const-class v1, Lxl6;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lag8;->q(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lxl6;

    .line 26
    .line 27
    check-cast v0, Lvd1;

    .line 28
    .line 29
    iget-object v0, v0, Lvd1;->b:Lvd1;

    .line 30
    .line 31
    new-instance v1, Lsd1;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lsd1;-><init>(Lvd1;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lyl6;->x:Lsd1;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p0, "Hilt service must be attached to an @HiltAndroidApp Application. Found: "

    .line 40
    .line 41
    invoke-static {p0, v2}, Lku4;->t(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_1
    :goto_0
    iget-object p0, p0, Lyl6;->x:Lsd1;

    .line 47
    .line 48
    return-object p0
    .line 49
    .line 50
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
