.class public final Lks1;
.super Ljava/lang/Object;

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final x:Lms1;

.field public final y:Lfv3;


# direct methods
.method public synthetic constructor <init>(Lms1;Lfv3;I)V
    .locals 0

    .line 1
    iput p3, p0, Lks1;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lks1;->x:Lms1;

    .line 4
    .line 5
    iput-object p2, p0, Lks1;->y:Lfv3;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lks1;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lks1;->y:Lfv3;

    .line 4
    .line 5
    iget-object p0, p0, Lks1;->x:Lms1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lms1;->a:Lps1;

    .line 11
    .line 12
    invoke-virtual {v0}, Lps1;->o()Lxq0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "Array"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lfv3;->k(Ljava/lang/String;)Lql4;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1, p0}, Lxq0;->b(Lvq0;Lms1;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0, v2}, Ld57;->g1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    iget-object v0, p0, Lms1;->a:Lps1;

    .line 32
    .line 33
    invoke-virtual {v0}, Lps1;->o()Lxq0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v2, Lm27;->C:Lup2;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lfv3;->j(Lup2;)Lql4;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1, p0}, Lxq0;->b(Lvq0;Lms1;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "Collection"

    .line 48
    .line 49
    invoke-static {p0, v0}, Ld57;->g1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
