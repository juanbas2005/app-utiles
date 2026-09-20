.class public final Ldt4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lzr3;


# instance fields
.field public final synthetic a:I

.field public final b:Lwe8;

.field public final c:Lzr3;


# direct methods
.method public constructor <init>(Lzr3;I)V
    .locals 1

    .line 1
    iput p2, p0, Ldt4;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, Ldt4;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p2, p1, v0}, Ldt4;-><init>(Lzr3;I)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Ldt4;->c:Lzr3;

    .line 16
    .line 17
    const-string p1, "androidx.navigation3.runtime.NavBackStack"

    .line 18
    .line 19
    iget-object p2, p2, Ldt4;->b:Lwe8;

    .line 20
    .line 21
    invoke-static {p1, p2}, Lb85;->c(Ljava/lang/String;Lll6;)Lwe8;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Ldt4;->b:Lwe8;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance p2, Lcs;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-direct {p2, p1, v0}, Lcs;-><init>(Lzr3;I)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Ldt4;->c:Lzr3;

    .line 41
    .line 42
    iget-object p1, p2, Lcs;->c:Lx74;

    .line 43
    .line 44
    check-cast p1, Lzr;

    .line 45
    .line 46
    const-string p2, "androidx.compose.runtime.SnapshotStateList"

    .line 47
    .line 48
    invoke-static {p2, p1}, Lb85;->c(Ljava/lang/String;Lll6;)Lwe8;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Ldt4;->b:Lwe8;

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method


# virtual methods
.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ldt4;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ldt4;->c:Lzr3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcs;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Lok1;->g(Lzr3;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/util/List;

    .line 15
    .line 16
    new-instance p1, Lyx6;

    .line 17
    .line 18
    invoke-direct {p1}, Lyx6;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, p0}, Lyx6;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    new-instance v0, Landroidx/navigation3/runtime/NavBackStack;

    .line 30
    .line 31
    check-cast p0, Ldt4;

    .line 32
    .line 33
    invoke-interface {p1, p0}, Lok1;->g(Lzr3;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lyx6;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Landroidx/navigation3/runtime/NavBackStack;-><init>(Lyx6;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final getDescriptor()Lll6;
    .locals 1

    .line 1
    iget v0, p0, Ldt4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldt4;->b:Lwe8;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Ldt4;->b:Lwe8;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Ldt4;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ldt4;->c:Lzr3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p2, Lyx6;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p0, Lcs;

    .line 14
    .line 15
    invoke-interface {p1, p0, p2}, Lj42;->g(Lzr3;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast p2, Landroidx/navigation3/runtime/NavBackStack;

    .line 20
    .line 21
    check-cast p0, Ldt4;

    .line 22
    .line 23
    invoke-virtual {p2}, Landroidx/navigation3/runtime/NavBackStack;->getBase$navigation3_runtime()Lyx6;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-interface {p1, p0, p2}, Lj42;->g(Lzr3;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
