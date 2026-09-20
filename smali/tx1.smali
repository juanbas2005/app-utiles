.class public final Ltx1;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Ld06;


# direct methods
.method public constructor <init>(Ld06;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ltx1;->x:I

    .line 11
    iput-object p1, p0, Ltx1;->y:Ld06;

    invoke-direct {p0, v0}, Lwx3;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lf96;Lux1;Ld06;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Ltx1;->x:I

    .line 3
    .line 4
    iput-object p3, p0, Ltx1;->y:Ld06;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ltx1;->x:I

    .line 2
    .line 3
    sget-object v1, Lkn7;->w:Lkn7;

    .line 4
    .line 5
    iget-object p0, p0, Ltx1;->y:Ld06;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lq23;

    .line 11
    .line 12
    iget-boolean p1, p1, Lq23;->M:Z

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Ld06;->w:Z

    .line 18
    .line 19
    sget-object v1, Lkn7;->y:Lkn7;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Lux1;

    .line 23
    .line 24
    iget-boolean v0, p1, Lll4;->J:Z

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    sget-object v1, Lkn7;->x:Lkn7;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iget-object v0, p1, Lux1;->L:Lux1;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    .line 37
    .line 38
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    const/4 v0, 0x0

    .line 42
    iput-object v0, p1, Lux1;->L:Lux1;

    .line 43
    .line 44
    iget-boolean p1, p0, Ld06;->w:Z

    .line 45
    .line 46
    iput-boolean p1, p0, Ld06;->w:Z

    .line 47
    .line 48
    :goto_1
    return-object v1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
