.class public final Lfi0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lfi0;

.field public static final b:Landroid/os/Handler;

.field public static final c:Ljava/lang/Object;

.field public static final d:Ld37;

.field public static e:Landroid/view/WindowManager;

.field public static f:Lvx0;

.field public static g:Lci0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfi0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfi0;->a:Lfi0;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lfi0;->b:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lfi0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {v0}, Le37;->a(Ljava/lang/Object;)Ld37;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lfi0;->d:Ld37;

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
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

.method public static a()V
    .locals 3

    .line 1
    sget-object v0, Lfi0;->b:Landroid/os/Handler;

    .line 2
    .line 3
    sget-object v1, Lfi0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lfi0;->f:Lvx0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    sget-object v1, Lfi0;->e:Landroid/view/WindowManager;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v1, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    :cond_0
    const/4 v0, 0x0

    .line 20
    sput-object v0, Lfi0;->f:Lvx0;

    .line 21
    .line 22
    sget-object v1, Lfi0;->g:Lci0;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v1, Lci0;->x:Lw54;

    .line 27
    .line 28
    sget-object v2, Lj54;->ON_PAUSE:Lj54;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lw54;->f1(Lj54;)V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lj54;->ON_STOP:Lj54;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lw54;->f1(Lj54;)V

    .line 36
    .line 37
    .line 38
    sget-object v2, Lj54;->ON_DESTROY:Lj54;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lw54;->f1(Lj54;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    sput-object v0, Lfi0;->g:Lci0;

    .line 44
    .line 45
    sput-object v0, Lfi0;->e:Landroid/view/WindowManager;

    .line 46
    .line 47
    return-void
    .line 48
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
