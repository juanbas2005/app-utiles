.class public final synthetic Lbj8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lxb7;


# direct methods
.method public synthetic constructor <init>(ILxb7;)V
    .locals 0

    .line 1
    iput p1, p0, Lbj8;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lbj8;->x:Lxb7;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    .line 1
    iget v0, p0, Lbj8;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lbj8;->x:Lxb7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lxb7;->c(Ljava/lang/Exception;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    new-instance v0, Ljava/io/IOException;

    .line 18
    .line 19
    const-string v1, "TIMEOUT"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lxb7;->c(Ljava/lang/Exception;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const-string p0, "Rpc"

    .line 31
    .line 32
    const-string v0, "No response"

    .line 33
    .line 34
    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
