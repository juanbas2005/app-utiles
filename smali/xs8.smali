.class public final Lxs8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lcx8;


# direct methods
.method public constructor <init>(Lev8;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lxs8;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p2, p0, Lxs8;->x:J

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lxs8;->y:Lcx8;

    .line 13
    .line 14
    return-void
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

.method public constructor <init>(Ll59;J)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxs8;->w:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lxs8;->x:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lxs8;->y:Lcx8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lxs8;->w:I

    .line 2
    .line 3
    iget-wide v1, p0, Lxs8;->x:J

    .line 4
    .line 5
    iget-object p0, p0, Lxs8;->y:Lcx8;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ll59;

    .line 11
    .line 12
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ly19;

    .line 15
    .line 16
    iget-object v0, v0, Ly19;->J:Lev8;

    .line 17
    .line 18
    invoke-static {v0}, Ly19;->d(Lcx8;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lev8;->f1(J)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Ll59;->A:Lf59;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p0, Lev8;

    .line 29
    .line 30
    invoke-virtual {p0, v1, v2}, Lev8;->i1(J)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
